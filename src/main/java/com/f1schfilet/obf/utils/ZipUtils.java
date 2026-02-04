package com.f1schfilet.obf.utils;

import lombok.experimental.UtilityClass;

import java.io.IOException;
import java.util.jar.Manifest;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

@UtilityClass
public class ZipUtils {

    public void writeZipEntry(ZipOutputStream zos, String name, byte[] data) throws IOException {
        if (data == null) return;
        zos.putNextEntry(new ZipEntry(name));
        zos.write(data);
        zos.closeEntry();
    }

    public void writeManifest(ZipOutputStream zos, String name, Manifest manifest) throws IOException {
        if (manifest == null) return;
        zos.putNextEntry(new ZipEntry(name));
        manifest.write(zos);
        zos.closeEntry();
    }
}