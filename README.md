# meta-arago-custom
Custom Qt5 based rootfs image layer for Arago distribution (http://arago-project.org/git/?p=meta-arago.git;a=summary)

e.g to create the image for am335x-evm
MACHINE=am335x-evm bitbake -k qt5-rootfs-image

To generate the sdk
MACHINE=am335x-evm bitbake qt5-rootfs-image -c populate_sdk

