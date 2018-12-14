# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Packagegroup for opencocon thinclient on cocon486 machine (without X.org)"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

COMPATIBLE_MACHINE = "cocon486"

COCON486_FIRMWARE = " \
b43-fwcutter \
zd1211-firmware \
"

RDEPENDS_${PN} = " \
cocon-data-doc \
dmidecode \
grub-legacy \
kbd \
kbd-keymaps \
kernel-modules \
keymaps \
pcmciautils \
opengalax \
spmachine-486 \
spmachine-486-early \
spmachine-486-shutdown \
v86d \
${COCON486_FIRMWARE} \
"

