require ${PN}.inc

LIC_FILES_CHKSUM = "\
    file://src/algs/stogo/COPYRIGHT;md5=4db779c8963e07fd1ba73ed315b94013 \
    file://src/algs/slsqp/COPYRIGHT;md5=bbfce7f9ce99c7b4d60b37c4a8db5ec9 \
    file://src/algs/newuoa/COPYRIGHT;md5=69279a3d362f3df7cde059e749ba6458 \
    file://src/algs/luksan/COPYRIGHT;md5=409138dd9d869c2e8ddeae8d5d039eb2 \
    file://src/algs/esch/COPYRIGHT;md5=1b77b615ff4a4c9471595d4ca4acc1ea \
    file://src/algs/direct/COPYING;md5=d0c85669acd941e21db1c3564aea3ea7 \
    file://src/algs/cobyla/COPYRIGHT;md5=7f9129c306a5785c7913b8a5883934bf \
    file://src/algs/bobyqa/COPYRIGHT;md5=700dca4c1a2d3517d2e372b064b09ec5 \
    file://src/algs/ags/COPYRIGHT;md5=df8018c0130b3c4b5961d163c169567b \
    file://COPYRIGHT;md5=1b4ae9cf9d4ec57f6dc120948e9b483a \
    file://COPYING;md5=7036bf07f719818948a837064b1af213 \
"

SRC_URI = "git://github.com/stevengj/nlopt.git;protocol=https;branch=master"
SRCREV = "09b3c2a6da71cabcb98d2c8facc6b83d2321ed71"

S = "${WORKDIR}/git"

inherit cmake

EXTRA_OECMAKE += "-DNLOPT_TESTS=OFF"

BBCLASSEXTEND = "native nativesdk"
