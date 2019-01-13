docker run \
    --name nginx \
    --net=blue-green \
    --link=hello-blue:hello-blue \
    --link=hello-green:hello-green \
    -p 80:80 \
    -d --rm \
    nginx
