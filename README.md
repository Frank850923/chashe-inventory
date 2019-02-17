# Build
mvn clean package && docker build -t se.chashe/kinesiska-tehuset-inventory .

# RUN

docker rm -f kinesiska-tehuset-inventory || true && docker run -d -p 8080:8080 -p 4848:4848 --name kinesiska-tehuset-inventory se.chashe/kinesiska-tehuset-inventory 