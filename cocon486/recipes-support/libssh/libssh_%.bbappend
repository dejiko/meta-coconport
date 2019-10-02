FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# i386 and ppc needs libssp_noshared.
DEPENDS += "libssp-nonshared"

SRC_URI += "\
            file://musl-ssp.patch \
"

