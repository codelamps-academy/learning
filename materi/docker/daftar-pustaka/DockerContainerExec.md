## CONTAINER EXEC
- Saat kita membuat container, aplikasi yang terdapat di dalam container hanya bisa diakses dari dalam container
- Oleh karena itu, kadang kita perlu masuk ke dalam containernya itu sendiri
- Untuk masuk ke dalam container, kita bisa menggunakan fitur Container Exec, dimana digunakan untuk mengeksekusi kode program yang terdapat di dalam container


## MASUK KE CONTAINER
- Untuk masuk ke dalam container, kita bisa mencoba mengeksekusi program bash script yang terdapat di dalam container dengan bantuan Container Exec : `docker container exec -i -t (container id) / (container name) /bin/bash`
- -i adalah argument interaktif, menjaga input tetap aktif
- -t adalah argument untuk alokasi pseudo-TTY (terminal akses)
- Dan /bin/bash contoh kode program yang terdapat di dalam container
![img.png](../asset/docker-exec.png)