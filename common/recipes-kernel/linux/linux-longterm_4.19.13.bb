SECTION = "kernel"
DESCRIPTION = "Longterm Linux kernel"
LICENSE = "GPLv2"

KBRANCH ?= "master"

require recipes-kernel/linux/linux-yocto.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

SRC_URI = "${KERNELORG_MIRROR}/linux/kernel/v4.x/linux-${PV}.tar.xz;name=kernel \
	file://coconport-common.scc \
"

S = "${WORKDIR}/linux-${PV}"

KERNEL_FEATURES_append = "coconport-common.scc"

SRC_URI[kernel.md5sum] = "e754ec479daa2a4ef28323fcb1bef6d3"
SRC_URI[kernel.sha256sum] = "f50a77fc40e13fc406791346fa91926394205874cd50246c7c2374006bacc0c2"
