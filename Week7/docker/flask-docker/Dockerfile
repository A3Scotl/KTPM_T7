# Sử dụng Python 3.9
FROM python:3.9

# Đặt thư mục làm việc
WORKDIR /app

# Sao chép file requirements.txt vào container
COPY app/requirements.txt .

# Cài đặt thư viện
RUN pip install -r requirements.txt

# Sao chép mã nguồn vào container
COPY app/ .

# Expose cổng 5000
EXPOSE 5000

# Chạy ứng dụng Flask
CMD ["python", "app.py"]