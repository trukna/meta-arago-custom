DESCRIPTION = "Include addon modules"
LICENSE = "MIT"
PR = "r0"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

# these require meta-openembedded/meta-oe layer
MEM_TOOLS = "\
    devmem2 \
"

FS_TOOLS = "\
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

EXTRA_TOOLS = "\
    ethtool \
    tslib-conf \
    tslib-calibrate \
    tslib-tests \
    ncurses \
    ncurses-terminfo \
    ncurses-tools \
    usbutils \
    strace \
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
    am-sysinfo \
    strace \
    nbench-byte \
    trace-cmd \
    arm-benchmarks \
    ptpd \
    stream \
    u-boot-fw-utils \
    iptables \
    iproute2 \
    iproute2-tc \
    oprofile \
    ${@bb.utils.contains('TUNE_FEATURES', 'armv7a', 'valgrind', '', d)} \
"

DEVTOOLS = " \
    packagegroup-core-buildessential \
"

# minimal set of packages - needed for application
RDEPENDS_${PN} = "\
    ${MEM_TOOLS} \
    ${FS_TOOLS} \
    ${EXTRA_TOOLS} \
    ${DEVTOOLS} \
"
