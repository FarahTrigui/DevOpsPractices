# DevOps CI/CD Pipeline

This project shows a basic CI/CD pipeline using **Jenkins**, **Maven**, and **Docker**.

## 🔧 What it does

- Clones the GitHub repository
- Builds the Java project with Maven
- Runs tests
- Builds a Docker image
- Pushes the image to Docker Hub

## 🧪 Requirements

- Jenkins with:
  - Git plugin
  - Pipeline plugin
  - Docker plugin
- Docker installed on the Jenkins machine
- A Docker Hub account
- A GitHub repository

## 🚀 How it works

Each push to the `main` branch triggers the Jenkins pipeline:

1. Clone the repository
2. Run `mvn clean install`
3. Run tests
4. Build Docker image
5. Push image to Docker Hub

## 🔗 Webhook
http://jenkinspublicipusingngrok:8080/github-webhook/

## 📦 Docker image name
fifia/java-app:v<build_number>-<date>

## 👤 Author
Farah Trigui


