docker cp nginx_green.conf nginx:/etc/nginx/nginx.conf
docker kill -s HUP nginx