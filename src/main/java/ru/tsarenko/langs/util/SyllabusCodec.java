package ru.tsarenko.langs.util;

import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.Codec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import ru.tsarenko.langs.model.Syllabus;

public class SyllabusCodec implements Codec<Syllabus> {

    @Override
    public Syllabus decode(BsonReader reader, DecoderContext decoderContext) {
        reader.readStartDocument();
        var syllabus = Syllabus.builder()
                .id(reader.readObjectId())
                .language(reader.readString("language"))
                .build();

        return syllabus;
    }

    @Override
    public void encode(BsonWriter writer, Syllabus value, EncoderContext encoderContext) {

    }

    @Override
    public Class<Syllabus> getEncoderClass() {
        return Syllabus.class;
    }

}
