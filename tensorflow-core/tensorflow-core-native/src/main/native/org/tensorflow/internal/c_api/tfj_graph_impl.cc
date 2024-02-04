/* Copyright 2024 The TensorFlow Authors. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
==============================================================================*/

#ifndef _WIN32

#include "tensorflow/c/c_api_internal.h"

extern "C" {

using namespace tensorflow;

TFJ_GraphId TFJ_GetGraphId(const TF_Graph* g) {
    return static_cast<void*>(const_cast<Graph*>(&g->graph));
}

void TFJ_UnmapOperationName(TF_Graph* g, TF_Operation* operation) {
    g->name_map.erase(operation->node.name());
}

} /* end extern "C" */

#else // #indef _WIN32

/* This extension is not available on Windows */
extern "C" {

TFJ_GraphId TFJ_GetGraphId(const TF_Graph* g) {
    return NULL;
}

void TFJ_UnmapOperationName(TF_Graph* g, TF_Operation* operation) {}

} /* end extern "C" */

#endif // #indef _WIN32
