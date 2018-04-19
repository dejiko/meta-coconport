FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

KMACHINE_cocon486 ?= "cocon486"
COMPATIBLE_MACHINE_cocon486 = "cocon486"
KCONFIG_MODE ?= "alldefconfig"
KBUILD_DEFCONFIG_cocon486 = "i386_defconfig"

SRC_URI_append_cocon486 += " \
	file://cocon486-standard.scc \
"

