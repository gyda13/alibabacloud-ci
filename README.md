# Spring Boot Deployment to Alibaba Cloud with GitHub Actions

- **Spring Boot (Java 17)**
- **GitHub Actions** – for CI/CD automation
- **Alibaba Cloud ACR** – container registry to store Docker images
- **Alibaba Cloud ECS** – virtual machine to host the app
- **Caddy** – reverse proxy and automatic HTTPS (TLS)
- **Docker** – containerization

## Deployment Flow

1. **Build and Push Image**
   - GitHub Actions builds a Docker image from the Spring Boot app.
   - The image is tagged and pushed to Alibaba Cloud ACR.

2. **Deploy to ECS**
   - GitHub Actions connects to the ECS instance via SSH.
   - It logs in to ACR and pulls the latest image.
   - The docker container is run and exposed on port `8080`.

3. **TLS Setup with Caddy**
   - A separate Caddy container runs on the ECS instance.
   - It handles HTTPS (TLS) for the custom domain `gyda.dev` and proxies requests to the Spring Boot container.

## Result

- https://gyda.dev/api/hello



