Learning Journey Provider

mvn clean install

docker build -t learning-journey-provider .

docker run -d -p 8080:8080 learning-journey-provider

docker-compose up --build --remove-orphans

kubectl get nodes -o wide

kubectl get services 