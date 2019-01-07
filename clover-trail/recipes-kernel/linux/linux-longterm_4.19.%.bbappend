FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

KMACHINE_clover-trail ?= "clover-trail"
COMPATIBLE_MACHINE_clover-trail = "clover-trail"
KCONFIG_MODE ?= "alldefconfig"
KBUILD_DEFCONFIG_clover-trail = "i386_defconfig"

SRC_URI_append_clover-trail += " \
	file://clover-trail-standard.scc \
	file://clover-trail.cfg \
"

