DESCRIPTION = "Pink Tablet KDE Framework 6 packagegroup"
SUMMARY = "Pink Tablet packagegroupd - desktop / kf6"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

RDEPENDS:${PN} = " \
    packagegroup-kf6-full \
"

