# Add a ROOTFS_POSTPROCESS_COMMAND that will strip the headers
# from the file system.

ROOTFS_POSTPROCESS_COMMAND += "remove_rootfs_include_rules;"

remove_rootfs_include_rules () {
    rm -rf ${IMAGE_ROOTFS}/include
    rm -rf ${IMAGE_ROOTFS}/usr/include
}
