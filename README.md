# Spring Boot Deployment to Google Cloud with GitHub Actions
- **Spring Boot (Java 17)**
- **GitHub Actions** – for CI/CD automation
- **Google Artifact Registry** – container registry to store Docker images
- **Google Compute Engine (GCE)** – virtual machine to host the app
- **Caddy** – reverse proxy and automatic HTTPS (TLS)
- **Docker** – containerization
## Deployment Flow
1. **Build and Push Image**
   - GitHub Actions builds a Docker image from the Spring Boot app.
   - The image is tagged and pushed to Google Artifact Registry.
2. **Deploy to GCE**
   - GitHub Actions connects to the GCE instance via SSH.
   - It authenticates to Artifact Registry and pulls the latest image.
   - The docker container is run and exposed on port `8080`.
3. **TLS Setup with Caddy**
   - A separate Caddy container runs on the GCE instance.
   - It handles HTTPS (TLS) for the custom domain `gyda.dev` and proxies requests to the Spring Boot container.
## Result
- https://gyda.dev
