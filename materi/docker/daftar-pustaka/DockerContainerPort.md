## CONTAINER PORT
- Saat menjalankan container, container tersebut terisolasi di dalam Docker
- Artinya sistem Host (misal laptop kita), tidak bisa mengakses aplikasi yang ada di dalam container secara langsung, salah satu caranya adalah harus menggunakan Container Exec untuk masuk ke dalam containernya
- Biasanya, sebuah aplikasi berjalan pada port tertentu, misal saat kita menjalankan aplikasi Redis, dia berjalan pada port 6379, kita bisa melihat port apa yang digunakan ketika melihat semua daftar container


## PORT FORWARDING
- Docker memiliki kemampuan untuk melakukan port forwarding, yaitu meneruskan sebuah port yang terdapat di sistem Hostnya ke dalam Docker Container
- Cara ini cocok jika kita ingin mengekspos port yang terdapat di container ke luar melalui sistem Host nya

## MELAKUKAN PORT FORWARDING
- Untuk melakukan port forwarding, kita bisa menggunakan perintah berikut ketika membuat container-nya : `docker container create --name (nama-container) --publish (posthost : portcontainer) image:tag`
- Jika kita ingin melakukan port forwarding lebih dari satu, kita bisa tambahkan dua kali parameter --publish
- --publish juga bisa disingkat menggunakan -p


