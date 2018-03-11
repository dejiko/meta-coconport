SECTION = "kernel"
DESCRIPTION = "Mainline Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit kernel

require recipes-kernel/linux/linux.inc

DEFAULT_PREFERENCE = "-1"

# uses linux 4.13-rc6
KERNGIT_VERSION ?= "4.13.0"
KERNGIT_SRCREV ?= "14ccee78fc82f5512908f4424f541549a5705b89"
KERNGIT ?= "${KERNGIT_VERSION}+gitAUTOINC+%"

PV = "${KERNGIT_VERSION}+git${SRCPV}"
SRCREV_pn-${PN} = "${KERNGIT_SRCREV}"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;protocol=git;branch=master \
        file://defconfig \
        "
S = "${WORKDIR}/git"

