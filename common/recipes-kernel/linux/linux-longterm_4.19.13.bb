SECTION = "kernel"
DESCRIPTION = "Longterm Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

KBRANCH ?= "master"

require recipes-kernel/linux/linux-yocto.inc

SRC_URI = "${KERNELORG_MIRROR}/linux/kernel/v4.x/linux-${PV}.tar.xz;name=kernel \
"

S = "${WORKDIR}/linux-${PV}"

#SRC_URI[kernel.md5sum] = "23de7a544b95ec07f281be8b67223401"
#SRC_URI[kernel.sha256sum] = "f4da4dc0f079e420e1c1b8c71312eaa5415b08be847aa224a61d8af6a6e74c6c"
