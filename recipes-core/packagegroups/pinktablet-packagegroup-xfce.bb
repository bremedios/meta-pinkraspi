DESCRIPTION = "Pink Tablet XFce packagegroup"
SUMMARY = "Pink Tablet packagegroupd - desktop / xfce"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    packagegroup-xfce-base \
"

