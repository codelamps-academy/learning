Docker Container adalah unit ringan dan portabel yang digunakan untuk menjalankan aplikasi beserta semua dependensinya (seperti kode, runtime, library, dan konfigurasi) dalam lingkungan yang terisolasi. Docker memungkinkan pengembang untuk mengemas aplikasi agar dapat berjalan secara konsisten di berbagai lingkungan, mulai dari laptop lokal hingga server produksi.

### Penjelasan Detail:
1. **Apa Itu Docker Container?**
    - Container adalah instansi dari *Docker Image* yang dijalankan. Image ini seperti cetakan yang berisi aplikasi dan dependensinya.
    - Berbeda dengan mesin virtual (VM), container tidak menyertakan sistem operasi penuh, melainkan hanya menggunakan kernel dari host OS, sehingga lebih ringan dan cepat.
    - Container bersifat terisolasi, artinya setiap container memiliki sistem file, jaringan, dan prosesnya sendiri, tetapi tetap berbagi sumber daya host seperti CPU dan memori.

2. **Komponen Utama:**
    - **Docker Engine**: Mesin inti yang menjalankan dan mengelola container.
    - **Docker Image**: File read-only yang berisi aplikasi dan dependensinya. Dibuat menggunakan *Dockerfile*.
    - **Docker Container**: Instansi aktif dari image yang berjalan sebagai proses.
    - **Docker Hub/Registry**: Tempat menyimpan dan mendistribusikan image, seperti Docker Hub atau registry pribadi.

3. **Cara Kerja:**
    - Container dibuat dari image menggunakan perintah seperti `docker run`.
    - Docker Engine mengelola container, termasuk mengatur isolasi dan alokasi sumber daya.
    - Container berkomunikasi dengan dunia luar melalui port mapping atau jaringan khusus Docker.

4. **Keunggulan Docker Container:**
    - **Portabilitas**: Container dapat berjalan di mana saja selama Docker Engine tersedia, tanpa khawatir perbedaan lingkungan.
    - **Efisiensi**: Karena tidak memerlukan OS tamu, container lebih hemat sumber daya dibandingkan VM.
    - **Konsistensi**: Memastikan aplikasi berjalan sama di pengembangan, pengujian, dan produksi.
    - **Skalabilitas**: Mudah untuk menjalankan banyak container untuk mendukung aplikasi berskala besar, terutama dengan alat seperti Kubernetes atau Docker Swarm.
    - **Pembaruan Mudah**: Image baru dapat dibuat dan diterapkan tanpa mengganggu container lain.

5. **Contoh Penggunaan:**
    - Menjalankan aplikasi web dalam container Nginx atau Apache.
    - Mengemas microservices agar setiap layanan berjalan di container terpisah.
    - Pengujian aplikasi di lingkungan yang identik dengan produksi.
    - CI/CD pipeline untuk deploy aplikasi secara otomatis.

6. **Perintah Dasar Docker:**
    - `docker pull <image>`: Mengunduh image dari registry.
    - `docker run <image>`: Menjalankan container dari image.
    - `docker ps`: Melihat container yang sedang berjalan.
    - `docker stop <container>`: Menghentikan container.
    - `docker build -t <name> .`: Membuat image dari Dockerfile.

7. **Perbedaan dengan Virtual Machine:**
    - **Ukuran**: Container jauh lebih kecil (MB) dibandingkan VM (GB).
    - **Kecepatan**: Container start dalam hitungan detik, VM butuh menit.
    - **Isolasi**: Container kurang terisolasi dibandingkan VM, tetapi cukup aman untuk sebagian besar kasus.
    - **Sumber Daya**: Container berbagi kernel host, VM memiliki OS sendiri.

8. **Tantangan:**
    - **Keamanan**: Jika tidak dikonfigurasi dengan baik, container bisa rentan karena berbagi kernel host.
    - **Manajemen**: Mengelola banyak container memerlukan alat orkestrasi seperti Kubernetes.
    - **Persistensi Data**: Container bersifat sementara, sehingga data perlu disimpan di volume atau storage eksternal.

### MEMBUAT CONTAINER
- Untuk membuat container, kita bisa gunakan perintah : `docker container create --name (nama container) (nama image) : tag`
  ![img.png](../asset/create-container.png)


### MENJALANKAN CONTAINER
- Untuk menjalankan container yang sudah kita buat, kita bisa gunakan perintah : `docker container start (container id) / (container name)`
  ![img.png](../asset/run-container.png)


### MENGHENTIKAN CONTAINER
- Untuk menghentikan container, kita bisa gunakan perintah : `docker container stop (container id) / (container name)`
  ![img.png](../asset/stop-container.png)

### MENGHAPUS CONTAINER
- Untuk menghapus container yang sudah berhenti, kita bisa gunakan perintah : `docker container rm (container id) / (container name)`
  ![img.png](../asset/remove-container.png)

### Contoh Sederhana:
Untuk menjalankan container Nginx:
```bash
docker run -d -p 8080:80 nginx
```
- `-d`: Menjalankan container di latar belakang.
- `-p 8080:80`: Memetakan port 8080 di host ke port 80 di container.
- `nginx`: Nama image yang digunakan.

Setelah itu, buka browser di `http://localhost:8080`, dan Anda akan melihat halaman default Nginx.

### Kesimpulan:
Docker Container merevolusi cara pengembangan dan deployment aplikasi dengan menawarkan solusi yang ringan, portabel, dan konsisten. Dengan Docker, pengembang dapat fokus pada kode tanpa khawatir tentang perbedaan lingkungan, sementara tim operasi dapat mengelola aplikasi dengan lebih mudah.

Jika Anda ingin penjelasan lebih spesifik (misalnya, cara membuat Dockerfile atau menggunakan Docker Compose), beri tahu saya!
