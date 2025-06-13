SUMMARY = "A console-only image that fully supports the target device \
hardware."

IMAGE_FEATURES += "splash"

LICENSE = "MIT"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL += "pinktablet-packagegroup-gnome"
