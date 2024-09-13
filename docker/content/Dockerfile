FROM bellsoft/liberica-openjre-alpine:21.0.4

ARG version=1
ENV APP_VERSION=$version
RUN echo "APP_VERSION=$APP_VERSION"

COPY /rootfs/ /
RUN chmod a+x /exeapp.sh

EXPOSE 8001

ENTRYPOINT /exeapp.sh $APP_VERSION