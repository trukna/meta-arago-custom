# Arago TI SDK full filesystem image

require ../../../meta-arago/meta-arago-distro/recipes-core/images/arago-image.inc

IMAGE_INSTALL += "\
    packagegroup-arago-tisdk-graphics \
    ${@bb.utils.contains('MACHINE_FEATURES','dsp','packagegroup-arago-tisdk-opencl','',d)} \
    ${@bb.utils.contains('MACHINE_FEATURES','dsp','packagegroup-arago-tisdk-opencl-extra','',d)} \
    packagegroup-arago-tisdk-amsdk \
    packagegroup-test \
    "

export IMAGE_BASENAME = "test-rootfs-image"
