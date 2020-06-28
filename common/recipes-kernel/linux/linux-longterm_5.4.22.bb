SECTION = "kernel"
DESCRIPTION = "Longterm Linux kernel"
LICENSE = "GPLv2"

KBRANCH ?= "master"

require recipes-kernel/linux/linux-yocto.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

SRC_URI = "${KERNELORG_MIRROR}/linux/kernel/v5.x/linux-${PV}.tar.xz;name=kernel \
	file://coconport-common.scc \
"

S = "${WORKDIR}/linux-${PV}"

SRC_URI[kernel.md5sum] = "81e8e4d41a79d80ca6a92096f17a9992"
SRC_URI[kernel.sha256sum] = "661bcb8d7e390dcc28e53795485e648f2bdc9b697b731459cc2bcc9ceb4a7d1a"

