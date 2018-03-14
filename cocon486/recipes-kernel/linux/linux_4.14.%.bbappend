FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_cocon486 += " \
           file://pata_legacy.patch \
           file://add-kme-kxlc005-0x2804.patch \
"

COMPATIBLE_MACHINE_cocon486 = "cocon486"
