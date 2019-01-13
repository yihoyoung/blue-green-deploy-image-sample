docker cp nginx_blue.conf nginx:/etc/nginx/nginx.conf
docker kill -s HUP nginx