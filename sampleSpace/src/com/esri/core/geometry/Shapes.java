package com.esri.core.geometry;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.esri.core.geometry.Geometry;
import com.esri.core.geometry.Operator.Type;
import com.esri.core.geometry.OperatorFactoryLocal;
import com.esri.core.geometry.OperatorImportFromESRIShape;
import com.esri.core.geometry.ShapeImportFlags;

public class Shapes {


	public static void main(String []args){


		try {
			ByteBuffer buffer = ByteBuffer.wrap(Files.readAllBytes(Paths.get("shapeFiles\\NHDWaterbody.shp")));

			buffer.order(ByteOrder.LITTLE_ENDIAN);
			OperatorImportFromESRIShape op = (OperatorImportFromESRIShape) OperatorFactoryLocal.getInstance().getOperator(
					Type.ImportFromESRIShape);
			SimpleByteBufferCursor byteBufferCursor = new SimpleByteBufferCursor(buffer);
			GeometryCursor geometryCursor = op.execute(ShapeImportFlags.ShapeImportNonTrusted, Geometry.Type.Unknown,
					byteBufferCursor);

			Geometry geo =geometryCursor.next();
			while (geo!=null) {
				Geometry.Type  type = geo.getType();
				System.out.println(type.name());
				geo =geometryCursor.next();
			}
		/* else {
			System.out.println("shape is null");

			}*/


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
