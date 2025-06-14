DESCRIPTION = "Pink Tablet KDE Framework 6 packagegroup"
SUMMARY = "Pink Tablet packagegroupd - desktop / kf6"

PACKAGE_ARCH = "${MACHINE_ARCH}"
REQUIRED_DISTRO_FEATURES = "wayland x11"

inherit packagegroup features_check

RDEPENDS:${PN} = " \
    qtwayland \
    kwindowsystem \
    packagegroup-kf6-full \
"

