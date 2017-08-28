FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://defconfig \
            file://primo81-usb-host.patch \
"

COMPATIBLE_MACHINE = "(sun4i|sun5i|sun6i|sun7i)"

COMPATIBLE_MACHINE = "primo81"

# uses linux 4.13-rc6
KERNGIT_VERSION = "4.13.0"
KERNGIT_SRCREV = "14ccee78fc82f5512908f4424f541549a5705b89"
KERNGIT = "${KERNGIT_VERSION}+gitAUTOINC+%"

require recipes-kernel/linux/linux-mainline-sunxi.inc

