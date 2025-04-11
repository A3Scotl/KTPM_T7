# Sử dụng Node.js phiên bản mới nhất
FROM node:18

# Đặt thư mục làm việc trong container
WORKDIR /app

# Sao chép file package.json vào container
COPY package.json ./

# Cài đặt dependencies
RUN npm install

# Sao chép toàn bộ mã nguồn
COPY . .

# Expose cổng 3000 cho server
EXPOSE 3000

# Chạy server khi container khởi động
CMD ["node", "server.js"]