// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \} dnnl_api_binary
 <p>
 *  \addtogroup dnnl_api_matmul
 *  \{
 <p>
 *  A descriptor of a matrix multiplication operation.
 * 
 *  2D case:
 *      dst[m, n] = src[m, k] * weights[k, n] + bias[m, n]
 * 
 *  3D case:
 *      dst[mb, m, n] = src[mb, m, k] * weights[mb, k, n] + bias[mb, m, n] */
@Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_matmul_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dnnl_matmul_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dnnl_matmul_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_matmul_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dnnl_matmul_desc_t position(long position) {
        return (dnnl_matmul_desc_t)super.position(position);
    }
    @Override public dnnl_matmul_desc_t getPointer(long i) {
        return new dnnl_matmul_desc_t((Pointer)this).offsetAddress(i);
    }

    /** The kind of primitive. Used for self-identifying the primitive
     *  descriptor. Must be #dnnl_matmul. */
    public native @Cast("dnnl_primitive_kind_t") int primitive_kind(); public native dnnl_matmul_desc_t primitive_kind(int setter);
    /** Source memory descriptor. */
    public native @ByRef dnnl_memory_desc_t src_desc(); public native dnnl_matmul_desc_t src_desc(dnnl_memory_desc_t setter);
    /** Weights memory descriptor. */
    public native @ByRef dnnl_memory_desc_t weights_desc(); public native dnnl_matmul_desc_t weights_desc(dnnl_memory_desc_t setter);
    /** Bias memory descriptor. */
    public native @ByRef dnnl_memory_desc_t bias_desc(); public native dnnl_matmul_desc_t bias_desc(dnnl_memory_desc_t setter);
    /** Destination memory descriptor. */
    public native @ByRef dnnl_memory_desc_t dst_desc(); public native dnnl_matmul_desc_t dst_desc(dnnl_memory_desc_t setter);
    /** The accumulator data type. Initialized automatically. */
    public native @Cast("dnnl_data_type_t") int accum_data_type(); public native dnnl_matmul_desc_t accum_data_type(int setter);
}
