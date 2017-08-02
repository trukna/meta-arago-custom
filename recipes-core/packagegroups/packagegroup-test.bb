DESCRIPTION = "Include QT5 modules"
LICENSE = "MIT"
PR = "r1"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

ARAGO_BASE = "\
    module-init-tools \
    mtd-utils \
    mtd-utils-ubifs \
    initscript-telnetd \
    ethtool \
    bash \
    udev-extraconf \
    kernel-modules \
"

# these require meta-openembedded/meta-oe layer
ARAGO_EXTRA = "\
    devmem2 \
"

ARAGO_TSLIB = "\
    tslib-conf \
    tslib-calibrate \
    tslib-tests \
"

ARAGO_NCURSES = "\
    ncurses \
    ncurses-terminfo \
    ncurses-tools \
"

ARAGO_FSTOOLS = "\
    e2fsprogs \
    e2fsprogs-e2fsck \
    e2fsprogs-mke2fs \
    e2fsprogs-tune2fs \
    dosfstools \
    util-linux-fdisk \
    util-linux-mkfs \
    util-linux-sfdisk \
    util-linux-fsck \
"

ARAGO_UTILS = "\
    fbset \
    usbutils \
    i2c-tools \
    strace \
"


ARAGO_SDK_PREREQ = "\
    zlib \
    libpng12 \
    jpeg \
    freetype \
    thttpd \
"

BASE_SDK = "\
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
    qtcharts \
    qtdeclarative \
    qtdeclarative-qmlplugins \
    qtimageformats \
    qtserialport \
    qtserialbus \
    qtconnectivity \
    qtxmlpatterns \
    qtquickcontrols \
    qtquickcontrols-qmlplugins \
    qtquickcontrols2 \
    qtquickcontrols2-qmlplugins \
    qtgraphicaleffects-qmlplugins \
    qtvirtualkeyboard-plugins \
    qtvirtualkeyboard-qmlplugins \
    liberation-fonts \
"

ARAGO_TEST = "\
    evtest \
    bc \
    memtester \
    powertop \
    stress \
    rng-tools \
    perf \
    smcroute \
    rwmem \
    kselftests \
    cpuset \
    procps \
    mtd-utils-ubifs-tests \
    cpuburn-neon \
    ltp-ddt \
    input-utils \
    cpuloadgen \
    timestamping \
    uvc-gadget \
    omapconf \
"

UTILS = " \
    am-sysinfo \
    strace \
    oprofile \
    nbench-byte \
    trace-cmd \
    arm-benchmarks \
    dropbear \
    openssh-sftp-server \
    ptpd \
    libdrm-kms \
    ${@bb.utils.contains('TUNE_FEATURES', 'armv7a', 'valgrind', '', d)} \
    stream \
    kexec \
    kdump \
    u-boot-fw-utils \
    mmc-utils \
    switch-config \
    uio-module-drv-test \
    uio-test-pruss \
    uio-module-drv \
"

DEVTOOLS = " \
    packagegroup-core-buildessential \
    packagegroup-core-tools-debug \
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

CONNECTIVITY_RDEPENDS = " \
    iptables \
    iproute2 \
    iproute2-tc \
"

# minimal set of packages - needed for application
RDEPENDS_${PN} = "\
    ${ARAGO_BASE} \
    ${ARAGO_EXTRA} \
    ${ARAGO_TSLIB} \
    ${ARAGO_FSTOOLS} \
    ${ARAGO_UTILS} \
    ${ARAGO_SDK_PREREQ} \
    ${BASE_SDK} \
    ${QT5_ESSENTIALS} \
    ${ARAGO_TEST} \
    ${UTILS} \
    ${WLAN_COMMON} \
    ${BLUETOOTH_STACK} \
    ${FIRMWARE_AND_DRIVERS} \
    ${CONNECTIVITY_RDEPENDS} \
"
