DESCRIPTION = "Basic modules to get a device booting"
LICENSE = "MIT"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

ARAGO_BASE = "\
    module-init-tools \
    mtd-utils \
    mtd-utils-ubifs \
    initscript-telnetd \
    bash \
    udev-extraconf \
    kernel-modules \
"

ARAGO_TSLIB = "\
    tslib-conf \
    tslib-calibrate \
    tslib-tests \
"

ARAGO_UTILS = "\
    fbset \
    i2c-tools \
"


ARAGO_SDK_PREREQ = "\
    zlib \
    libpng12 \
    jpeg \
    freetype \
    thttpd \
"

BASE_SDK = "\
    libstdc++ \
    dbus \
    expat \
    glib-2.0 \
    libxml2 \
    libpcre \
    iptables \
    iperf \
    arago-gpl-notice \
    arago-feed-config \
    cifs-utils \
"

QT5_ESSENTIALS = "\
    qtbase \
    qtconnectivity \
    qtconnectivity-qmlplugins \
    qtdeclarative \
    qtdeclarative-tools \
    qtdeclarative-qmlplugins \
    qtimageformats \
    qtquickcontrols \
    qtquickcontrols-qmlplugins \
    qtquickcontrols2 \
    qtquickcontrols2-qmlplugins \
    qtserialport \
    qtserialbus \
    qtsvg \
    qtxmlpatterns \
"

UTILS = " \
    dropbear \
    openssh-sftp-server \
    libdrm-kms \
    kexec \
    kdump \
    mmc-utils \
    switch-config \
    uio-module-drv-test \
    uio-test-pruss \
    uio-module-drv \
"

# WLAN support packages.
# These are the packages that all platforms use for WLAN support
WLAN_COMMON = "\
    wireless-tools \
    iw \
    softap-udhcpd-config \
    eventdump \
    wlconf \
    wpa-supplicant-wl18xx \
    crda \
    hostap-daemon-wl18xx \
    wl18xx-calibrator \
    wl18xx-target-scripts \
"

# netperf has non-standard license, needs verifying
#    netperf

FIRMWARE_AND_DRIVERS = "\
    wl18xx-fw \
    bt-fw \
"

BLUETOOTH_STACK = "\
    bluez5 \
    bluez5-obex \
    bluez5-noinst-tools \
    bluez5-testtools \
    uim \
    bt-enable \
    sbc \
"

# minimal set of packages - needed for application
RDEPENDS_${PN} = "\
    ${ARAGO_BASE} \
    ${ARAGO_TSLIB} \
    ${ARAGO_UTILS} \
    ${ARAGO_SDK_PREREQ} \
    ${BASE_SDK} \
    ${QT5_ESSENTIALS} \
    ${UTILS} \
    ${WLAN_COMMON} \
    ${BLUETOOTH_STACK} \
    ${FIRMWARE_AND_DRIVERS} \
"
