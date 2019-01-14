mvn clean package
<<<<<<< HEAD
=======

>>>>>>> blue
cp Dockerfile target/

cd target

<<<<<<< HEAD
docker build -t 192.168.1.52/devops/lihaorong-green-deploy:v1.0 .
=======
docker build -t 192.168.1.52/devops/lihaorong-blue-deploy:v1.0 .
>>>>>>> blue

