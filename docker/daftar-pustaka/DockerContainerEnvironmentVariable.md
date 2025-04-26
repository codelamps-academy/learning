## CONTAINER ENVIRONMENT VARIABLE
- Saat membuat aplikasi, menggunakan Environment Variable adalah salah satu teknik agar konfigurasi aplikasi bisa diubah secara dinamis
- Dengan menggunakan environment variable, kita bisa mengubah-ubah konfigurasi aplikasi, tanpa harus mengubah kode aplikasi lagi
- Docker Container memiliki parameter yang bisa kita gunakan untuk mengirim environment variable ke aplikasi yang terdapat di dalam container


## MENAMBAHKAN ENVIRONMENT VARIABLE
- Untuk menambah environment variable, kita bisa menggunakan perintah --env atau -e, misal : `docker container create --name (nama : container) --env KEY="value" --env KEY2="value" image:tag`