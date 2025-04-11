# Sử dụng Node.js LTS làm base image
FROM node:18-alpine

# Thiết lập thư mục làm việc bên trong container
WORKDIR /app

# Sao chép package.json và cài đặt dependencies
COPY package.json .
RUN npm install

# Sao chép toàn bộ mã nguồn vào container
COPY . .

# Expose cổng 3000
EXPOSE 3000

# Chạy ứng dụng
CMD ["npm", "start"]
