FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# i386 and ppc needs libssp_noshared.
CFLAGS += " -lssp_nonshared "
LDFLAGS += " -lssp_nonshared "
