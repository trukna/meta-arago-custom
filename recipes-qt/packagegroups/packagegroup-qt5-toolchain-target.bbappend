DESCRIPTION = "Avoid installing extra Qt5 headers and libraries related into the SDK"
LICENSE = "MIT"
PR = "r0"

RDEPENDS_${PN}_remove = " \
    qtquick1-dev \
    qtquick1-mkspecs \
    qtquick1-plugins \
    qtquick1-qmlplugins \
    qtwebkit-dev \
    qtwebkit-mkspecs \
    qtwebkit-qmlplugins \
    qt3d-dev \
    qt3d-mkspecs \
    qt3d-qmlplugins \
    qtmultimedia-dev \
    qtmultimedia-mkspecs \
    qtmultimedia-plugins \
    qtmultimedia-qmlplugins \
    qtlocation-dev \
    qtlocation-mkspecs \
    qtlocation-plugins \
    qtlocation-qmlplugins \
    qtsensors-dev \
    qtsensors-mkspecs \
    qtsensors-plugins \
    qtsensors-qmlplugins \
    qtsystems-dev \
    qtsystems-qmlplugins \
    qtsystems-mkspecs \
    qttools-dev \
    qttools-mkspecs \
    qttools-staticdev \
    qttools-tools \
    qttools-plugins \
    qtwebsockets-dev \
    qtwebsockets-mkspecs \
    qtwebsockets-qmlplugins \
    qttranslations-qtwebsockets \
    qtwebchannel-dev \
    qtwebchannel-mkspecs \
    qtwebchannel-qmlplugins \
    qtwebengine-dev \
    qtwebengine-mkspecs \
    qtwebengine-qmlplugins \
"
