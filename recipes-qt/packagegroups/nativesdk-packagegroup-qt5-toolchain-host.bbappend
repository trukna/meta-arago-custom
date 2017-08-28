DESCRIPTION = "Avoid installing extra Qt5 headers and libraries related into the host SDK"
LICENSE = "MIT"
PR = "r0"

RDEPENDS_${PN}_remove = " \
    nativesdk-qttools-tools \
"

RDEPENDS_${PN}_append = " \
    nativesdk-qtbase-tools-staticdev \
    nativesdk-qtdeclarative-tools \
    nativesdk-qtdeclarative-staticdev \
"
