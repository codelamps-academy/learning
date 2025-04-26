## CONTAINER LOG
- Kadang saat terjadi masalah dengan aplikasi yang terdapat di container, sering kali kita ingin melihat detail dari log aplikasinya
- Hal ini dilakukan untuk melihat detail kejadian apa yang terjadi di aplikasi, sehingga akan memudahkan kita ketika mendapatkan masalah


## MELIHAT CONTAINER LOG
- Untuk melihat log aplikasi di container kita, kita bisa menggunakan perintah : `docker container logs (container id) / (container name)`
- Atau jika ingin melihat log secara realtime, kita bisa gunakan perintah : `docker container logs -f (container id) / (container name)`