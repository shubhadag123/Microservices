FROM node:alpine AS builder
ENV PORT 80
RUN mkdir -p /app

RUN sleep 5s 

WORKDIR /app

COPY . .

RUN npm install && \
    npm run build 

FROM nginx:alpine
COPY --from=builder /app/dist/* /usr/share/nginx/html/
