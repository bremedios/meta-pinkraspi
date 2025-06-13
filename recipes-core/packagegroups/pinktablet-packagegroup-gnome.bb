DESCRIPTION = "Pink Tablet Gnome packagegroup"
SUMMARY = "Pink Tablet packagegroupd - desktop / gnome"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    packagegroup-gnome-desktop \
"

