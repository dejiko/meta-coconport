DESCRIPTION = "zd1211 wifi files for the Linux kernel"
HOMEPAGE = "http://zd1211.ath.cx/"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://zd1211-firmware/COPYING;md5=eb723b61539feef013de476e68b5c50a"

SRC_URI = "${SOURCEFORGE_MIRROR}/zd1211/zd1211-firmware-${PV}.tar.bz2"

S = "${WORKDIR}"

do_compile() {
	:
}

do_install() {
	install -d  ${D}/lib/firmware/zd1211/
	install -m 0644 ${S}/zd1211-firmware/zd1211* ${D}/lib/firmware/zd1211/
}

FILES_${PN} += "/lib/firmware/*"
PACKAGE_ARCH = "all"


SRC_URI[md5sum] = "19f28781d76569af8551c9d11294c870"
SRC_URI[sha256sum] = "866308f6f59f7075f075d4959dff2ede47735c751251fecd1496df1ba4d338e1"
