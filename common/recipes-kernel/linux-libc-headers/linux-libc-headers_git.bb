require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

SRC_URI_append_libc-musl = "\
    file://0001-libc-compat.h-fix-some-issues-arising-from-in6.h.patch \
    file://0002-libc-compat.h-prevent-redefinition-of-struct-ethhdr.patch \
    file://0003-remove-inclusion-of-sysinfo.h-in-kernel.h.patch \
   "

DEFAULT_PREFERENCE = "-1"

# uses linux 4.13-rc6
KERNGIT_VERSION = "4.13.0"
KERNGIT_SRCREV = "14ccee78fc82f5512908f4424f541549a5705b89"
KERNGIT = "${KERNGIT_VERSION}+gitAUTOINC+%"


PV = "${KERNGIT_VERSION}+git${SRCPV}"
SRCREV_pn-${PN} = "${KERNGIT_SRCREV}"

SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/torvalds/linux.git;protocol=git;branch=master \
        "

S = "${WORKDIR}/git"
