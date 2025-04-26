## DOCKER IMAGE
- Docker Image mirip seperti installer aplikasi, dimana di dalam Docker Image terdapat aplikasi dan dependency
- Sebelum kita bisa menjalankan aplikasi di Docker, kita perlu memastikan memiliki Docker Image aplikasi tersebut


## MELIHAT DOCKER IMAGE
- Untuk melihat Docker Image yang terdapat di dalam Docker Daemon, kita bisa menggunakan perintah `docker image ls`


## DOWNLOAD DOCKER IMAGE
- Untuk download Docker Image dari Docker Registry, kita bisa gunakan perintah : `docker pull (nama image) : tag`
- Kita bisa mencari Docker Image yang ingin kita download di `https://hub.docker.com/`
- ![img.png](../asset/docker-download.png)


## MENGHAPUS DOCKER IMAGE
- Jika kita tidak ingin menggunakan Docker Image yang sudah kita download, kita bisa gunakan perintah : `docker image rm (nama image) : tag`