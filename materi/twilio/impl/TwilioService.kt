package com.bharata.payslipautomationspring.service

import com.twilio.Twilio
import com.twilio.rest.api.v2010.account.Message
import com.twilio.rest.api.v2010.account.MessageCreator
import com.twilio.type.PhoneNumber
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import java.net.URI

/**
 * =============================================================
 * Project     : payslip-automation-spring-kotlin
 * Created by  : Andre Rizaldi Brillianto
 * Email       : andrerizaldib@gmail.com
 * Created on  : 4/23/2025
 * =============================================================
 * Copyright (c) 2025 Andre Rizaldi Brillianto
 * All rights reserved.
 * =============================================================
 */

@Service
class WhatsAppServiceTwilio {
    @Value("\${twilio.account-sid}")
    private lateinit var accountSid: String

    @Value("\${twilio.auth-token}")
    private lateinit var authToken: String

    @Value("\${twilio.from-whatsapp}")
    private lateinit var fromWhatsapp: String

    fun sendPdf(toPhone: String, message: String): Boolean {
        try {
            println("Initializing Twilio with SID: ${accountSid.take(5)}... and token: ${authToken.take(5)}...")
            Twilio.init(accountSid, authToken)

            // Format nomor tujuan
            val formattedTo = formatPhoneNumber(toPhone)
            println("Sending to formatted number: $formattedTo")

            // Mencoba kirim pesan tanpa media
            val message = Message.creator(
                PhoneNumber("whatsapp:$formattedTo"),  // Pastikan awalan "whatsapp:"
                PhoneNumber(fromWhatsapp),
                message
            ).create()

            println("Message SID: ${message.sid}")
            println("Message Status: ${message.status}")

            return true
        } catch (e: Exception) {
            println("ERROR SENDING MESSAGE: ${e.javaClass.name}: ${e.message}")
            e.printStackTrace()
            return false
        }
    }

    private fun formatPhoneNumber(nomor: String): String {
        return when {
            nomor.startsWith("+") -> nomor.substring(1)  // Remove the +
            nomor.startsWith("0") -> "62${nomor.substring(1)}"  // Replace 0 with 62
            nomor.startsWith("62") -> nomor  // Already correct format
            else -> "62$nomor"  // Add prefix if missing
        }
    }
}