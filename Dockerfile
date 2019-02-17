FROM airhacks/glassfish
COPY ./target/kinesiska-tehuset-inventory.war ${DEPLOYMENT_DIR}
