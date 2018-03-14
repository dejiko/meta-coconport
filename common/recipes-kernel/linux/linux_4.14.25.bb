SECTION = "kernel"
DESCRIPTION = "Mainline Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel

require recipes-kernel/linux/linux.inc

SRC_URI = "${KERNELORG_MIRROR}/linux/kernel/v4.x/linux-${PV}.tar.xz;name=kernel"
S = "${WORKDIR}/linux-${PV}"

SRC_URI[kernel.md5sum] = "c55f9b201ed60b03ee879efd263d01dd"
SRC_URI[kernel.sha256sum] = "6dcfbf79c068e51c1b06edb1ce58ddc9ca351f862bf2a144e96106ec3f21e587"
